#5) Write and test a program to provide total number of objects present / available on the given path.
#python 3.x
import os
path= input("Enter the path")
type(path)
list = os.listdir(path)
for l in list:
    print(list)

number_files = len(list)
print("Number of files in path "+path+" is ",number_files)
