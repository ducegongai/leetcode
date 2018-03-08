// ConsoleApplication1.cpp : �������̨Ӧ�ó������ڵ㡣
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
		mark = res;//��ǽڵ㣨ͷ�ڵ㣩��
		while (!q1.empty() || !q2.empty()||sum!=0) {                 //�зǿն���
			if (!q1.empty()) { sum += q1.front(); q1.pop(); }
			if (!q2.empty()) { sum += q2.front(); q2.pop(); }
			ListNode *head = new ListNode(sum / 10);
			res->next = head;//�Ƚ��ڵ��ٸ�ֵ����ֹ���һ��ѭ����һ��0�ڵ�
			res = head;
			res->val = sum % 10;
			sum /= 10;  //ͬʱ������һλ�Ƿ��λ�������λ�򽫽�λ�ӽ�ȥ
		}	
		return mark->next;//�����սڵ�
		
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