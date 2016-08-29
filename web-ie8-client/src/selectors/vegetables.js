
export const getVegetableByName = (state, name) => {
  console.log(name);
  return state.vegetables.find((vegetable) => (vegetable.name === name));
};

// (state.vegetables.find((vegetable) => (vegetable.name === name)))
