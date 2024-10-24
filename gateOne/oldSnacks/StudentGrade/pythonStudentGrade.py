while True:
	try:
		number_of_students = int(input('Enter number of students: '))
		number_of_subjects = int(input('Enter number of subjects: '))
        	
		if number_of_students < 0 or number_of_subjects < 0:
			print("Invalid input. Number of students and subjects must be non-negative.")
			continue  
		else:
			matrix = [[0] * number_of_subjects for _ in range(number_of_students)]
            
		for row in range(number_of_students):
			for column in range(number_of_subjects):
				matrix[row][column] = int(input('Enter score of student: '))

		print("      ", " ", end="")

		for count in range(number_of_subjects):
			
			print(f"Col{count} {""}", end=" ")
		print()	
            
		for row in range(number_of_students):
			print("Row", row + 1, " ", end="")
			for column in range(number_of_subjects):
				print(f"{matrix[row][column]:5}", end=" ")
			print()
		break  

	except ValueError:
		print("Invalid input. Please enter numbers only.")
