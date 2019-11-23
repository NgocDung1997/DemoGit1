var skills = [".NET", "Android", "C++", "Front-end", "Java"];
var planned = [130, 20, 47, 19, 40];

var ctx = document.getElementById("myChart");
var myChart = new Chart(ctx, {
    type: 'radar',
    data: {
        labels: skills,
        datasets: [{
            data: planned
        }]
    }
});