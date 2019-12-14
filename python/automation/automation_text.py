from datetime import datetime
import os

dt = datetime.today().strftime('%y%m%d')
directory = "D:/MEGA/"

outfile_name = "merged_{}.txt".format(datetime.today().strftime('%y%m%d'))

out_file = open(outfile_name,'w')
files = os.listdir(directory)

for filename in files:
  if ".txt" not in filename:
    continue
  file = open(directory+filename)
  for line in file:
    out_file.write(line)
    print(filename)

  out_file.write("\n\n")

  file.close()
out_file.close()

