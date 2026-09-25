class Solution {
    public boolean isValid(String s) {
        Stack<Character> st=new Stack<>();

        int i=0;
        while(s.length()>i){
            char ch=s.charAt(i);

            if(ch=='('||ch=='['||ch=='{'){
                st.push(ch);
            }
            else{
                if(st.size()==0){
                    return false;
                }
                char top=st.pop();
                if(ch==')'&& top!='('){
                    return false;
                }
                if(ch=='}'&& top!='{'){
                    return false;
                }
                if(ch==']'&&top!='['){
                    return false;
                }
            }
            i++;
        }
       return st.isEmpty(); 
    }
    
}