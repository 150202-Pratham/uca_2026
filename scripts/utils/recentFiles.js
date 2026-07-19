const { execSync } = require("child_process");

function getRecentFiles(limit = 5) {
    try {
        const output = execSync(
            "git diff-tree --no-commit-id --name-only -r HEAD"
        )
        .toString()
        .trim()
        .split("\n");

        return output.slice(0, limit);
    } catch (err) {
        return [];
    }
}

module.exports = getRecentFiles;
