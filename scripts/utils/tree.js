const fs = require("fs");
const path = require("path");

const IGNORE = new Set([
    ".git",
    "node_modules",
    ".github",
    "scripts"
]);

function generateTree(dir, prefix = "", depth = 0) {
    let output = "";
    if(depth >=2) return "" ;

    const items = fs
        .readdirSync(dir)
        .filter(item => !IGNORE.has(item))
        .sort((a, b) => {
            const aDir = fs.statSync(path.join(dir, a)).isDirectory();
            const bDir = fs.statSync(path.join(dir, b)).isDirectory();

            if (aDir && !bDir) return -1;
            if (!aDir && bDir) return 1;

            return a.localeCompare(b);
        });

    items.forEach((item, index) => {
        const fullPath = path.join(dir, item);
        const isLast = index === items.length - 1;

        output += `${prefix}${isLast ? "└── " : "├── "}${item}\n`;

        if (fs.statSync(fullPath).isDirectory()) {
            output += generateTree(
                fullPath,
                prefix + (isLast ? "    " : "│   "),
		depth + 1
            );
        }
    });

    return output;
}

module.exports = generateTree;
