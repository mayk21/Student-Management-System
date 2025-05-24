<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1" />
</head>
<body>
    <h1>Student Management System</h1>
    <h2>Overview</h2>
    <p>
        This project is a Java-based application designed for academic institutions to manage student records efficiently. It performs 
        <strong>Create, Read, Update, and Delete (CRUD)</strong> operations, each accessible via its own dedicated user interface. The system
        employs an <strong>AVL tree data structure</strong> to maintain balanced and fast record searching, insertion, and deletion, ensuring 
        optimal performance even with large datasets.
    </p>
    <h2>Features</h2>
    <ul>
        <li><strong>CRUD Operations:</strong> Intuitive interfaces to create new records, view existing student information, update details, and delete records.</li>
        <li><strong>AVL Tree Implementation:</strong> Efficient self-balancing tree structure for fast data retrieval and consistent performance.</li>
        <li><strong>User-friendly Interface:</strong> Simple and clean Java GUI designed for ease of use by administrative staff.</li>
        <li><strong>Data Integrity:</strong> Robust handling of record consistency during updates and deletions.</li>
        <li><strong>Account Management:</strong> Allows creation and management of user accounts for secure access to the system.</li>
    </ul>
    <h2>Tech Stack</h2>
    <ul>
        <li><strong>Programming Language:</strong> Java</li>
        <li><strong>Data Structure:</strong> AVL Tree for efficient record management</li>
    </ul>
    <h2>Installation</h2>
    <ol>
        <li>Clone the repository:<br>
            <code>git clone https://github.com/yourusername/student-record-management.git</code>
        </li>
        <li>Open the project in your favorite Java IDE (e.g., IntelliJ IDEA, Eclipse, NetBeans).</li>
        <li>Build and run the project.</li>
    </ol>
    <h2>Usage</h2>
    <ol>
        <li><strong>Create Record:</strong> Use the create interface to add new student information.</li>
        <li><strong>Read Records:</strong> Browse or search existing student records quickly using the AVL tree structure.</li>
        <li><strong>Update Record:</strong> Select a student record and modify the details as needed.</li>
        <li><strong>Delete Record:</strong> Remove student records through the delete interface, ensuring tree balance is maintained.</li>
        <li><strong>Account Creation:</strong> Manage user accounts for authorized system access.</li>
    </ol>
    <h2>Data Structure Details</h2>
    <p>
        The AVL tree maintains balanced height after every insertion and deletion to keep operations like search, insert, and delete 
        efficient at <em>O(log n)</em> time complexity. This ensures the system performs well even with growing amounts of student data.
    </p>
    <h2>Contributing</h2>
    <ol>
        <li>Fork the repository.</li>
        <li>Create a feature branch: <code>git checkout -b feature-branch</code></li>
        <li>Commit your changes: <code>git commit -m 'Add new feature'</code></li>
        <li>Push to your branch: <code>git push origin feature-branch</code></li>
        <li>Create a Pull Request to the main repository.</li>
    </ol>
    <h2>Contact</h2>
    <p>
        For questions or support, contact <a href="mailto:malikasfand466@gmail.com">malikasfand466@gmail.com</a> or open an issue in the repository.
    </p>
</body>
</html>
