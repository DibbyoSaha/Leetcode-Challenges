/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
import java.math.BigInteger;
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        ListNode l = l1.next;
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(l1.val);
        while(l != null){
            list.add(l.val);
            l = l.next;
        }
        
        ListNode ls = l2.next;
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        list2.add(l2.val);
        while(ls != null){
            list2.add(ls.val);
            ls = ls.next;
        }
        
        String a = "";
        String b = "";
        for (int i=list.size()-1; i>=0; i--){
            a += list.get(i);
        }
        for (int i=list2.size()-1; i>=0; i--){
            b += list2.get(i);
        }
        
        a = a.trim();
        b = b.trim();
        
        BigInteger ab = new BigInteger(a);
        BigInteger bc = new BigInteger(b);
        
        BigInteger num = ab.add(bc);
        String str = String.valueOf(num);
        str=str.trim();
        
        ArrayList<Integer> arr = new ArrayList<Integer>();
        
        for (int i=str.length()-1; i>=0; i--){
            arr.add(Character.getNumericValue(String.valueOf(num).charAt(i)));
        }
        
        ListNode node1 = new ListNode(arr.get(arr.size()-1));
        
        if(arr.size() == 1){
            return node1;
        }
        else{
            ListNode node2 = new ListNode(arr.get(arr.size()-2), node1);

            for(int i=arr.size()-3; i>=0; i--){
                node2 = new ListNode(arr.get(i), node2);
            }
            return node2;
        }

    }        
}
