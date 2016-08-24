import { VEGETABLES_SET, VEGETABLE_SET } from 'constants/actionTypes';

export const setVegetables = (vegetables) => ({
  type: VEGETABLES_SET,
  vegetables
});

export const setVegetable = (vegetable) => ({
  type: VEGETABLE_SET,
  vegetable
});


export const requestVegetables = () => () => {
  fetch(`http://${window.location.href}:8003`)
    .then((response) => (console.log(response.json())));
};
