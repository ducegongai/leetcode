// ConsoleApplication1.cpp : 定义控制台应用程序的入口点。
//

#include "stdafx.h"
#include "iostream"
#include "stack"
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
		stack<int> s1, s2;
		while (l1) {
			s1.push(l1->val);	
			l1 = l1->next;
		}
		while (l2) {
			s2.push(l2->val);
			l2 = l2->next;
		}
		int sum = 0;
		ListNode *res = new ListNode(0);
		while (!s1.empty() || !s2.empty()) {
			if (!s1.empty()) { sum += s1.top(); s1.pop(); }
			if (!s2.empty()) { sum += s2.top(); s2.pop(); }
			res->val = sum % 10;
			ListNode *head = new ListNode(sum / 10);
			head->next = res;
			res = head;
			sum /= 10;  //同时计算上一位是否进位，如果进位则将进位加进去
		}
		return res->val == 0 ? res->next : res;
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