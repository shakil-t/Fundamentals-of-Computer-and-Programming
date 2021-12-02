# -*- coding: utf-8 -*-
"""
Created on Wed Oct 18 09:54:28 2017

@author: shakil
"""

n=15
count=0
for i in range(2,n):
    if(count==1):
        print(n,"is a three-divisor number")
        break
    elif(n%i==0):
        count+=1