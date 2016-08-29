
export const getVegetableByName = (state, name) => {
  return state.vegetables.find((vegetable) => (vegetable.name === name));
};

// (state.vegetables.find((vegetable) => (vegetable.name === name)))
