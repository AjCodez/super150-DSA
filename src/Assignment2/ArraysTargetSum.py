n=int(input())
arr=list(map(int,input().split()))
t=int(input())
arr.sort()
for i in range(n-2):
	l=i+1
	r=n-1
	while l<r:
		if arr[i]+arr[l]+arr[r]==t:
			print(arr[i],", ",arr[l]," and ",arr[r],sep="")
			r-=1
		elif arr[i]+arr[l]+arr[r]<t:
			l+=1
		else:
			r-=1