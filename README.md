#leetcode
164_Hard: Maximum Gap。求无序数组有序顺序中，最大相邻间隔，要求O(n) time 和 O(n) space。用treeMap可以做，但是效率低。标准答案用桶排序，首先找出数组中的min和max。则有个公式：最大maxGap不会小于(max-min)/(nums.length-1)向上取整。因此，桶的长度为(max-min)/(nums.length-1)向上取整，这样，排序后在一个桶中的元素不用相互之间在比较了，因为它们的差值肯定小于桶长度，不会是我们需要求的，对于每一个桶，只需存放在桶了最大和最小的值，然后计算相邻桶中（前一个桶的max和后一个桶min）即可。

214_Hard: 给一个字符串，在前面加上一个最短的字符串，使得生成的字符串是回文的。问题转化为求原字符串s.substring(0,i)是回文，i要最大。然后把s.substring(i+1,n)反转加到前面即可。注意，用传统的动态规划会出现memory limit，要用确定一个中心，然后往两边延伸，发现是回文后立即处理返回。用KMP算法会更好，但是还没有研究过。

230_Medium: 求BST中第K个元素，用dfs中序遍历，搜到之后立刻return节约时间。

233_Medium: 求1的个数？找规律，分别统计每一位上出现的个数，分为三种情况：=0；=1；>1 总结得到公式:

    (a+8)/10*m+(b+1)*(a%10==1?1:0)
    
234_Easy: 判断链表是否是回文的（要求O(n)）,找到链表中间点，把前一段链表反转，在和后一段逐个比较。

235_Easy: BST中求两个节点共同的最低的父节点。递归搜索BST，每次判断两个节点的值和根节点的值得关系，决定是向左还是向右还是返回。

236_Medium：继235中，在二叉树中求两个节点的共同的最低父节点。方法1：分别找到root到此两个节点的路径，比较路径，找到第一个不同的节点；方法2：递归，如果某个节点c是p和q的公共父节点，则p，q一定分别位于其左右子树中。

237_Easy：删除链表中某个节点，但只给访问该节点的权限。将后一个节点的值付给该节点，并把给节点的next指向原来next的next。

238_Medium：求数组除了自己所有元素的积。两次循环，第一次从左到右，re[i]储存nums[0]...nums[i]的积，第二次从右到左，re[i]*=(nums[i+1]...nums[nums.length-1])的积。

239_Hard：求移动窗口中最大的值。我的方法--用start记录当前窗口的最大值得index，每当窗口移动时，首先判断新进来的nums[i]是否比nums[start],如果大的话start=i，否则再start是否在窗口里，如果不在，重新遍历窗口找最大的值对应的index赋给start。最后返回nums[start]。标准方法，维护一个双端队列，没进来一个index，把小于该nums[index]的indexs都从队列里移除，这样该队列就是非递减的。判断队列头部（最大的元素对应的index）是否在窗口内，不是则移除。返回队列头部index对应的值。

241_Medium: 计算一个算数表达式所有的结果。运用分治法的典型列子。找到一个计算符，递归计算左边所有可能的结果，递归计算所有右边可能的结果，然后合并起来。

240_Medium: 二分查找有序矩阵的某个元素是否存在。用二分查找的分治法。每次取行和列的中间点，判断目标是是否等于它，如果不等，根据matrix[midI][midJ]的大小关系，可以舍弃左上或者右下继续搜索。注意，分成三片区域搜索才行，两片会超时，不知道，为什么。应该还有更快的算法，明天研究一下。另一种更快的方法是从右上角开始搜索，大于target向左(j--)，小于target向下(i++)，等于返回。时间复杂度O(m+n)。

257_Easy: Binary Tree Paths。求二叉树所有路径。用dfs遍历整棵数。
258_Easy: Add Digits。找规律题。列出从1到21个数时发现答案是1-9的循环。.
