#User function Template for python3
# eg. s="Hello" a=""
# x=4 a=""+o
#x=3 a=""+l
#x=2 a=""+l
#x=1 a=""+e
#x=0 a=""+h
#x=-1? no as it will only go upto 0

def reverseWord(s):
    a=""
    
    for x in range (len(s)-1,-1,-1):
        a=a+s[x]
    
        
    return a    
        
    #your code here

#{ 
#  Driver Code Starts
#Initial Template for Python 3

if __name__ == "__main__":
    t = int(input())
    while(t>0):
        s = input()
        print(reverseWord(s))
        t = t-1

# } Driver Code Ends
