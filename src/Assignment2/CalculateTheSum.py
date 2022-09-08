a=int(input())
arr = list(map(int,input().split()))
for _ in range(int(input())):
	x=int(input())
	arr2=list(arr)
	for i in range(a):
		arr2[i]+=arr[i-x]
	arr=list(arr2)
print(sum(arr)%(10**9+7))