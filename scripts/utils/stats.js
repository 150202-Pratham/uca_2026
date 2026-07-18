const fs = require("fs");
const path = require("path")

function getRepositoryStats(rootDir){
	let stats = {

		java:0,
		c:0,
		markdown:0,
		folders:0,
		totalFiles:0,

	};

	function traverse(currentPath){
		const items = fs.readdirSync(currentPath);

		for(const item of items){
			if( item === ".git" || item === "node_modules"){
				continue ;
			 }
		    
			const fullPath = path.join(currentPath , item) ;
			const fileStat = fs.statSync(fullPath) ;

			if(fileStat.isDirectory()){
				stats.folders++ ;
				traverse(fullPath);
			}

			else{
				stats.totalFiles++;
				const ext = path.extname(item);

				switch (ext){
					case ".java":
						stats.java++;
						break;
					case ".c":
						stats.c++;
						break;
					case ".md":
						stats.markdown++;
						break;
				}
			}
		}
	}

	traverse(rootDir);

	return stats ;
}

module.exports = getRepositoryStats;


		  
