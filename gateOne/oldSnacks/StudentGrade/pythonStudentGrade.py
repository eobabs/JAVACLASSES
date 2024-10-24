while True:
	try:
		number_of_students = int(input('Enter number of students: '))
		number_of_subjects = int(input('Enter number of subjects: '))
		
		if number_of_students < 0 or number_of_subjects < 0:
			print("Number of students and subjects must be positive numbers. Enter again")
			continue
		else:
			student_names = []
			subject_names = []

			for student_count in range(number_of_students):
				name_of_student = input(f'Enter name of student {student_count + 1}: ')
				student_names.append(name_of_student)

			for subject_count in range(number_of_subjects):
				name_of_subject = input(f'Enter name of subject {subject_count + 1}: ')
				subject_names.append(name_of_subject)

			matrix = [[0] * number_of_subjects for _ in range(number_of_students)]

			for row in range(number_of_students):
				for column in range(number_of_subjects):
					matrix[row][column] = int(input(f'Enter score of {student_names[row]} in {subject_names[column]}: '))

			print("        ", " ", end="")
			for subject in subject_names:
				print(f"{subject:10}", end=" ")
			print("           Total  Average")
			
			for row in range(number_of_students):
				print(f"{student_names[row]:10} ", end="")
				total = 0
				for column in range(number_of_subjects):
					print(f"{matrix[row][column]:10}", end=" ")
					total += matrix[row][column]
				if number_of_subjects > 0:
					average = total / number_of_subjects
				else:
					average = 0
				print(f"{total:10}     {average:.2f}")
			break

	except ValueError:
		print("Invalid input. Please enter numbers only.")
