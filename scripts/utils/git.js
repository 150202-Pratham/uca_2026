const { execSync } = require("child_process");

function getLatestCommit() {
    try {
        const message = execSync(
            'git log -1 --pretty=%s'
        ).toString().trim();

        const author = execSync(
            'git log -1 --pretty=%an'
        ).toString().trim();

        const date = execSync(
            'git log -1 --pretty=%ad --date=short'
        ).toString().trim();

        return {
            message,
            author,
            date
        };
    } catch (err) {
        return {
            message: "No commits found",
            author: "-",
            date: "-"
        };
    }
}

module.exports = getLatestCommit;
