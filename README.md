Поміняв назву змінної humanIMB на BodyMassIndex, бо має бути camelcase, виправив всюди пробіли, десь їхню відсутність, десь зайву присутність, поміняв назви функцій getter і setter для змінних, а також самі назви змінних w і h на зрозумілі і чіткі height і weight, котрі ні з чим не сплутати. також додав у коментарі одиницю виміру метри і кг. 
Було додано функцію окрему для розрахунку індексу, щоб вона задавалась тільки в одному місці і не було навіть шансу з'явитись розбіжностям. Виправлено & на && у порівнянні, нормалізовано if, що там if else стало, було забрано null з тої функції, адже результат може бути тільки однозначним, також самі результати було перейменовано на більш зрозумілі.