class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
         ListNode a=new ListNode();
        if (lists.length>=1)
        a.next=lists[0];
        for(int i=1;i<lists.length;i++){

            if(lists[i]==null)continue;
            ListNode li=lists[i];
            ListNode n;
            while(li!=null){
                            ListNode curr=a.next;
            ListNode prev=a;
                    while(curr!=null&&curr.val<li.val){
                        prev=curr;
                        curr=curr.next;
                    }
                    if(curr!=null){
                    n=li.next;
                    prev.next=li;
                    li.next=curr;
                    li=n;
                    }
                    else{
                        prev.next=li;
                        break;
                    }
                    }   
        }
        return a.next;
    }
}
