#leetcode
230: 求BST中第K个元素，用dfs中序遍历，搜到之后立刻return节约时间。

233: 求1的个数？找规律，分别统计每一位上出现的个数，分为三种情况：=0；=1；>1 总结得到公式:

    (a+8)/10*m+(b+1)*(a%10==1?1:0)
    
234: 判断链表是否是回文的（要求O(n)）,找到链表中间点，把前一段链表反转，在和后一段逐个比较。

235: BST中求两个节点共同的最低的父节点。递归搜索BST，每次判断两个节点的值和根节点的值得关系，决定是向左还是向右还是返回。
