/*
 * @param {string[]} logs
 * @return {number} 
 */

var minOperations = function(logs){
	let current = 0;
	for(let i = 0; i < logs.length; i++){
		if(logs[i] == "../" && current != 0){
			current -= 1;
		}
		else if(logs[i] == "../" && current == 0){
			current += 0}
		else if(logs[i] == "./"){
			current += 0;
		}
		else{
			current += 1;}
	}
	return current;
};
