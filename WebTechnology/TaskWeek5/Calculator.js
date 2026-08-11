function* calc(initial) {
    let result = initial;

    while (true) {
        const input = yield result;

        try {
            const { operation, value } = input;

            if (!["add", "subtract", "multiply", "divide"].includes(operation)) {
                yield "Invalid operation";
                continue;
            }

            if (typeof value !== "number" && typeof value !== "string") {
                yield "Invalid input";
                continue;
            }

            const num = Number(value);

            if (!Number.isFinite(num)) {
                yield "Invalid input";
                continue;
            }

            if (operation === "add") {
                result += num;
            } 
            else if (operation === "subtract") {
                result -= num;
            } 
            else if (operation === "multiply") {
                result *= num;
            } 
            else {
                if (num === 0) {
                    yield "Cannot divide by zero";
                    continue;
                }
                result /= num;
            }

            yield result;

        } catch (error) {
            yield "Invalid input";
        }
    }
}


const calculator = calc(50);

console.log(calculator.next({ operation: "add", value: 30 }).value);

console.log(calculator.next({ operation: "multiply", value: "2" }).value);

console.log(calculator.next({ operation: "add", value: "30" }).value);
