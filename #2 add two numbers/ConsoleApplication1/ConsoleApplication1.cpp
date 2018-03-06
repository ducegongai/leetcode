// ConsoleApplication1.cpp : 定义控制台应用程序的入口点。
//

#include "stdafx.h"
#include "iostream"
#include <queue>

using namespace std;

 // Definition for singly - linked list.
 struct ListNode {
	int val;
	ListNode *next;
	ListNode(int x) : val(x), next(NULL) {}
	
};


class Solution {

public:
	static ListNode* addTwoNumbers(ListNode* l1, ListNode* l2) {
		queue<int> q1, q2;
		while (l1) {
			q1.push(l1->val);
			l1 = l1->next;
		}
		while (l2) {
			q2.push(l2->val);
			l2 = l2->next;
		}
		int sum = 0;
		ListNode *res = new ListNode(0);
		ListNode *mark = new ListNode(0);
		mark = res;//标记节点（头节点），
		while (!q1.empty() || !q2.empty()||sum!=0) {                 //有非空队列
			if (!q1.empty()) { sum += q1.front(); q1.pop(); }
			if (!q2.empty()) { sum += q2.front(); q2.pop(); }
			ListNode *head = new ListNode(sum / 10);
			res->next = head;//先建节点再赋值，防止最后一次循环多一个0节点
			res = head;
			res->val = sum % 10;
			sum /= 10;  //同时计算上一位是否进位，如果进位则将进位加进去
		}	
		return mark->next;//跳过空节点
		
	}
};

void main(){
	
	ListNode *l1 = new ListNode(2);
	ListNode *l2 = new ListNode(4);
	ListNode *l3 = new ListNode(3);
	ListNode *l4 = new ListNode(5);
	ListNode *l5 = new ListNode(6);
    ListNode *l6 = new ListNode(4);

	l1->next = l2;
	l2->next = l3;


	l4->next = l5;
	l5->next = l6;
	
	ListNode* begin = Solution::addTwoNumbers(l1, l4);
	while (begin != NULL){
		cout << begin->val << " ";
		begin = begin->next;
	}


}