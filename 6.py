#6)Write and Test a Program to search a 16 character license key from the provided input spreadsheet.

import xlrd 
  
loc = ("student_record.ods")
  
wb = xlrd.open_workbook(loc) 
sheet = wb.sheet_by_index(0)
sheet.cell_value(0, 0)
  
for i in range(sheet.nrows):
    for j in range(sheet.ncols):
	if len(str(sheet.cell_value(i,j)))==16:
		print(sheet.cell_value(i, j))
