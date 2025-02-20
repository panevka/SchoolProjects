const fuelTypeInput = document.getElementById("fuelType");
const fuelLitresInput = document.getElementById("fuelLitres");
const result = document.getElementById("result");
const submit = document.getElementById("submit");

submit.addEventListener("click", (event) => {
  const fuelType = fuelTypeInput.value;
  const fuelLitresAmount = fuelLitresInput.value;

  switch (parseInt(fuelType)) {
    case 1:
      result.innerText = `koszt paliwa: ${4 * fuelLitresAmount} zł`;
      break;
    case 2:
      result.innerHTML = `koszt paliwa: ${3.5 * fuelLitresAmount} zł`;
      break;
    default:
      result.innerHTML = `koszt paliwa: 0 zł`;
      break;
  }
});
