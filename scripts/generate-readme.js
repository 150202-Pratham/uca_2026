const fs = require("fs");
const path = require("path");

const getRepositoryStats = require("./utils/stats");

const generateTree = require("./utils/tree");

const getLatestCommit = require("./utils/git") ;

const getRecentFiles = require("./utils/recentFiles") ;

const templatePath = path.join(__dirname, "templates", "README.template.md");
const readmePath = path.join(__dirname, "..", "README.md");

const rootDir = path.join(__dirname, "..");


let content = fs.readFileSync(templatePath, "utf8");

const stats = getRepositoryStats(rootDir);

const latestCommit = getLatestCommit() ;

const recentFiles = getRecentFiles() ;

const tree = generateTree(rootDir);

const statsMarkdown = `
| Metric | Count |
|--------|------:|
| Java Files | ${stats.java} |
| C Files | ${stats.c} |
| Markdown Files | ${stats.markdown} |
| Folders | ${stats.folders} |
| Total Files | ${stats.totalFiles} |
`;

content = content.replace("{{STATS}}", statsMarkdown);

content = content.replace(
    "{{TREE}}",
    "```text\n" + tree + "```"
);


content = content.replace(
    "{{LATEST_COMMIT}}",
`
**Message:** ${latestCommit.message}

**Author:** ${latestCommit.author}

**Date:** ${latestCommit.date}
`
);

const recentFilesMarkdown = recentFiles
    .map(file => `- ${file}`)
    .join("\n");

content = content.replace(
    "{{RECENT_FILES}}",
    recentFilesMarkdown
);


fs.writeFileSync(readmePath, content);

console.log("README generated successfully.");
