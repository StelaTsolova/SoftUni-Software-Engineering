function solve(array) {
    let object = {};

    for (let i = 0; i < array.length; i += 2) {
        let food = array[i];
        let calories = Number(array[i + 1]);

        object[food] = calories;
    }

    console.log(object);
}