#  Arrays store elements in contiguous memory locations, resulting in easily calculable addresses for the elements stored and this allows faster access to an element at a specific index.

cars = ["Ford", "Volvo", "BMW"]
print(cars)

cars[0] = "Toyota"
print(cars)

x = len(cars)
print(x)

for x in cars:
    print(x)
    
cars.append("Honda")
print(cars)

cars.remove("Volvo")
print(cars)