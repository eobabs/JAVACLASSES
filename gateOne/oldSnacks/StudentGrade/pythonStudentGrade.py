while True:
	try:
		number_of_students = int(input('Enter number of students: '))
		number_of_subjects = int(input('Enter number of subjects: '))

		if number_of_students < 0 or number_of_subjects < 0:
			print("Number of students and subjects must be positive numbers. Enter again.")
			continue

		student_names = []
		subject_names = []
		matrix = []
		totals = []
		ranks = []

		for student_count in range(number_of_students):
			name_of_student = input(f'Enter name of student {student_count + 1}: ')
			student_names.append(name_of_student)

		for subject_count in range(number_of_subjects):
			name_of_subject = input(f'Enter name of subject {subject_count + 1}: ')
			subject_names.append(name_of_subject)

		for row in range(number_of_students):
			row_scores = []
			for column in range(number_of_subjects):
				row_scores.append(0)
			matrix.append(row_scores)

		for row in range(number_of_students):
			for column in range(number_of_subjects):
				score = int(input(f'Enter score of {student_names[row]} in {subject_names[column]}: '))
				matrix[row][column] = score

		for row in range(number_of_students):
			total = 0
			for column in range(number_of_subjects):
				total += matrix[row][column]
			totals.append(total)

		for index in range(number_of_students):
			rank = 1
			for index_two in range(number_of_students):
				if totals[index] < totals[index_two]:
					rank += 1
			ranks.append(rank)

		print("=" * 80)
		header_row = "\n" + "STUDENTS" + " " * 2
		for subject in subject_names:
			header_row += subject + " " * (10 - len(subject))
		header_row += "Total     Average   Rank"
		print(header_row)

		print("=" * 80)

		for checker in range(number_of_students):
			student_name = student_names[checker]
			total = totals[checker]

			if number_of_subjects > 0:
				average = total / number_of_subjects
			else:
				average = 0

			student_row = student_name + " " * (10 - len(student_name))

			for index in range(number_of_subjects):
				score_str = str(matrix[checker][index])
				student_row += score_str + " " * (10 - len(score_str))
			total_str = str(total)
			student_row += total_str + " " * (10 - len(total_str))
			average_str = f"{average:.2f}"
			student_row += average_str + " " * (10 - len(average_str))
			student_row += str(ranks[checker])
			print(student_row)

		print("=" * 80)
		print("=" * 80)

		break

	except ValueError:
		print("Invalid input. Please enter numbers only.")
