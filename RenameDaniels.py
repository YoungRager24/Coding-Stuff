import shutil, os
from pathlib import Path

#defining paths
dir = "C:\\Users\\ktjda\\Downloads\\project files"
folder_path = "C:\\Users\\ktjda\\Downloads\\xlsx_renamed"
extension = ".xlsx"
prefix = "SCC"

#creating folder for renamed files
if not os.path.exists(folder_path):
    os.mkdir(folder_path)
    
#moving the files
for file in os.listdir(dir):
    if os.path.splitext(file)[-1] == extension:
        shutil.move(os.path.join(dir, file), folder_path)

#renaming the files
for filename in os.listdir(folder_path):
    old_file_path = os.path.join(folder_path, filename)
    if os.path.isfile(old_file_path):
        new_filename = f"{prefix}{filename}"
        new_file_path = os.path.join(folder_path, new_filename)
        os.rename(old_file_path, new_file_path)
