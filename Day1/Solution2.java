class Solution2 {
    LinkedList<Integer> que;
       public RecentCounter() {
           que=new LinkedList<>();
           
       }
       
       public int ping(int t) {
           que.addLast(t);
           while((que.get(que.size()-1)-que.get(0))>3000)
               que.removeFirst();
           
           return que.size();
       }
   }
   
   /**
    * Your RecentCounter object will be instantiated and called as such:
    * RecentCounter obj = new RecentCounter();
    * int param_1 = obj.ping(t);
    */
