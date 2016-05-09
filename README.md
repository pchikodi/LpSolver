# LpSolver
Linear programming
 
### Prerequisities

Make sure lpsolve55.dll and lpsolve55j.dll are placed in System32 folder
based on system type i.e., 32bit or 64 bit <br/>
[download link](https://svn.win.tue.nl/trac/prom/export/49/Packages/LpSolve/)

## Executing program
Use below command to execute jar file.
Executable jar file is located in executable folder

java -jar LpSolver.jar

## User input
Application input in below format

Problem statement

Maximize: 143x+60y 
Subject to: 
120x+210y <= 15000
110x+30y <= 4000 
x+y <= 75

Enter number of unknown variabls <br/>
2 <br/>
Enter number of unknown variabls <br/>
3 <br/>
Enter your 1 constraint <br/>
Enter coefficient value for unknown variable : 1 <br/>
120 <br/>
Enter coefficient value for unknown variable : 2 <br/>
210 <br/>
Enter constraint equality <br/>
1 for Less than eqaul to <br/>
2 for Greater than equal to <br/>
3 for equal to <br/>
1 <br/>
Enter constraint value : <br/>
15000 <br/>

repeat for other two constraints.. <br/>
Enter Objective function <br/>
Enter coefficient value for unknown variable : 1 <br/>
143 <br/>
Enter coefficient value for unknown variable : 2 <br/>
63 <br/>

## Expected output

After entering above input, expected output is <br/>

Value of objective function: 6315.625 <br/>
Value of var[0] = 21.875 <br/>
Value of var[1] = 53.12499999999999 <br/>

## Authors

* **Pranav Chikodi** - *Initial work* - [pchikodi](https://github.com/pchikodi)

## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details

