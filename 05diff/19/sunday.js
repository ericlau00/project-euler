let start = new Date(1901, 0, 1);
let end = new Date(2000, 11, 31);
let count = 0;

for(; start <= end; start.setMonth(start.getMonth() + 1)) {
    if (start.getUTCDay() == 0) {
        count++;
    }
}

console.log(count);