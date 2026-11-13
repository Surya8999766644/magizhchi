function calculationGrade(marks) {
    if (marks > 90){
        return "A+";

}
else IF(marks > 75){
        return "A";
}
ELSE IF (marks > 60){
        return "b";
}
ELSE IF (marks > 50){
        return "c";
else {
    return "fail"
}
}
console.log(calulateGrade(95));
console.log(calulateGrade(80));
console.log(calulateGrade(65));
console.log(calulateGrade(45));