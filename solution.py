# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def traverse(self, p, q, b):
        if not p:
            if q:
                b[0] = False
            
            return
        
        if not q:
            b[0] = False
            return
        
        if p.val != q.val:
            b[0] = False
            return
        
        self.traverse(p.left, q.left, b)
        self.traverse(p.right, q.right, b)
    
    def isSameTree(self, p, q):
        b = [True]
        self.traverse(p, q, b)
        return b[0]
