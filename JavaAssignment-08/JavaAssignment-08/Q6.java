class Converter {
    double convertInchesToCm(double inches) {
        return inches * 2.54;
    }
    double convertFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
    double convertMetersToKm(double meters) {
        return meters * 0.001;
    }
}
