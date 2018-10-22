# 4) Write and test a program to select the number of students who have scored less than 60
# in any subject from the existing Spreadsheet to the new Spreadsheet.

import xlrd, os, sys, subprocess, xlwt
from xlwt import Workbook

wb1 = Workbook()
sheet1 = wb1.add_sheet('Sheet 1')

sheet1.write(0, 0, 'USN')
sheet1.write(0, 1, 'NAME')
sheet1.write(0, 2, 'Branch')
sheet1.write(0, 3, 'M1')
sheet1.write(0, 4, 'M2')
sheet1.write(0, 5, 'M3')

count = 0
loc = ("student_record.csv")

wb = xlrd.open_workbook(loc)
sheet = wb.sheet_by_index(0)
sheet.cell_value(0, 3)

p = 1
for i in range(1, sheet.nrows):
    if ( sheet.cell_value(i, 3) < 60 or sheet.cell_value(i, 4) < 60 or sheet.cell_value(i, 5) < 60 ):
        count = count + 1

        usn = sheet.cell_value(i, 0)
        name = sheet.cell_value(i, 1)
        branch = sheet.cell_value(i, 2)
        m1 = sheet.cell_value(i, 3)
        m2 = sheet.cell_value(i, 4)
        m3 = sheet.cell_value(i, 5)

		sheet1.write(p, 0, usn)
		sheet1.write(p, 1, name)
		sheet1.write(p, 2, branch)
		sheet1.write(p, 3, m1)
		sheet1.write(p, 4, m2)
		sheet1.write(p, 5, m3)
wb1.save('new_student_record.csv')
p = p + 1

# use print(' this synatx is for python 3.x')
print ("Number of students who have scored less than 60 : ", count)

subprocess.call(["open", "new_student_record.csv"])
