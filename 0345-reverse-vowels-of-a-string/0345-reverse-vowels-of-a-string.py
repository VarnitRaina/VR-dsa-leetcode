class Solution(object):
    def reverseVowels(self, s):
        """
        :type s: str
        :rtype: str
        """
        i=0
        j=len(s)-1
        s=list(s)
        while i<j:
            if s[i].lower() in ['a','e','i','o','u'] and s[j].lower() in ['a','e','i','o','u']:
                s[i],s[j]=s[j],s[i]
                i+=1
                j-=1
            elif s[i].lower() not in ['a','e','i','o','u'] and s[j].lower() in ['a','e','i','o','u']:
                i+=1
            elif s[i].lower() in ['a','e','i','o','u'] and s[j].lower() not in ['a','e','i','o','u']:
                j-=1
            else:
                i+=1
                j-=1
        return ''.join(s)
