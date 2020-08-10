import sys,time

def intToString():
    s=''
    num=sys.maxsize #sys.maxsize is the current interpreter's max word size 
    t0=time.time()
    s=str(num)
    t1=time.time()-t0
    print('using str() is '+'{:.6f}'.format(t1*1000)+'ms')
    
def stringToInt():
    s="9223372036854775807"
    num=0
    t0=time.time()
    num=int(s)
    t1=time.time()-t0
    print('using int() is '+'{:.6f}'.format(t1*1000)+'ms')

print("Int to String")
intToString()
print()
print("String to Int")
stringToInt()