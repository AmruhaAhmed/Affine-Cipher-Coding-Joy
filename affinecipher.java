import java.util.*;
class affinecipher
{
    Scanner ob=new Scanner(System.in);
    void main()
    {
        int a,b;// a- multiplier, b-additive shift value
        String plaintext,ciphertext="";//to store plaintext and cipher text respectively
        int i,j;//i and j are loop counters
        int cc,pos;//cc- storing ciphertext of current letter, pos-stores numerical equivalent of character
        char start='A';//starting character in alpha array
        int number[]=new int[26];//array of numerical equivalent of alphabets
        char alpha[]=new char[26];//array of alphabets from A to Z
        System.out.print("Enter the multiplier 'a':");
        a=ob.nextInt();
        System.out.print("Enter the additive shift 'b':");
        b=ob.nextInt();
        System.out.print("Enter the plaintext:");
        plaintext=ob.next(); 
        plaintext=plaintext.toUpperCase();
        for(i=0;i<26;i++)
        {//storing current alphabet in alpha and its numerical equivalent in number
            number[i]=i;
            alpha[i]=start;
            start++;
        }
        for(j=0;j<plaintext.length();j++)
        {
            char c=plaintext.charAt(j); //getting the current character of plaintext
            pos=0;
            for(i=0;i<alpha.length;i++)
            {//finding numerical equivalent of 'c'
              if(c==alpha[i])
              {
                  pos=i;
                  break;
                }                
            }
            cc=((a*pos)+b)%26;//calculating ciphertext of alphabet 'c'     
            ciphertext=ciphertext+""+alpha[cc];//updating the ciphertext string         
        }
        System.out.println("The cipher text is "+ciphertext);
    }
}

        