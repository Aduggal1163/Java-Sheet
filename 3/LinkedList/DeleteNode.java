class DeleteNode{
    public static void main(String[] args) {
        //lc 237
        public void deleteNode(ListNode node) {
             node.val=node.next.val;
             node.next=node.next.next;
        }
    }
}