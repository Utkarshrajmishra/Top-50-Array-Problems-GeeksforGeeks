class Reverse
{
    // Complete the function
    // str: input string
    public static String reverseWord(String str)
    {
        // Reverse the string str
        String stu="";
        for(int i=str.length()-1;i>=0;i--)
        {
            stu+=str.charAt(i);
        }
        return stu;
    }
}
