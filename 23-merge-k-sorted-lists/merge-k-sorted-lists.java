    class Solution {
        private ListNode merge(ListNode l1,ListNode l2){
            ListNode dummy=new ListNode(-1);
            ListNode tail=dummy;
            ListNode result=l1;
            ListNode p1=l1;
            ListNode p2=l2;
            while(p1!=null&&p2!=null){
                if(p1.val<=p2.val){
                    tail.next=p1;
                    p1=p1.next;
                }else{
                    tail.next=p2;
                    p2=p2.next;
                }
                tail=tail.next;
            }
            if(p1!=null){
                tail.next=p1;
            }else{
                tail.next=p2;
            }
            return dummy.next;
            }
        public ListNode mergeKLists(ListNode[] lists) {
             if (lists == null || lists.length == 0)return null;
             ListNode result=lists[0];
            for (int i = 1; i < lists.length; i++) {
                result = merge(result, lists[i]);
            }
        return result;
        }
    }