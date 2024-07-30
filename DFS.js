/**
 * Definition for a binary tree node.
 * function TreeNode(val, left, right) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.left = (left===undefined ? null : left)
 *     this.right = (right===undefined ? null : right)
 * }
 */
/**
 * @param {TreeNode} root
 * @return {number[]}
 */
var inorderTraversal = function(root) {
        const res = [];//We are making the RES and the stack here
        const stack = [];

    while (root || stack.length > 0){
        while(root){//What we are doing is while we have a tree we check on the left until we hit a null value
            stack.push(root);
            root = root.left;
        }        
	//We take it back one, push the current value and check the right
        root = stack.pop();
        res.push(root.val);
        root = root.right;
    }
	//Once we no longer have a tree to look at we return res
    return res;
}
