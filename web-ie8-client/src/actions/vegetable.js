import { VEGETABLES_SET, VEGETABLE_SET } from 'constants/actionTypes';
import {
  requestVegetables as apiRequestVegetables,
  requestVegetable as apiRequestVegetable
} from 'api/apiService';

export const setVegetables = (vegetables) => ({
  type: VEGETABLES_SET,
  vegetables
});

export const setVegetable = (vegetable) => ({
  type: VEGETABLE_SET,
  vegetable
});


export const requestVegetables = () => (dispatch) => {
  apiRequestVegetables()
    .then((response) => (dispatch(setVegetables(response))));
};

export const requestVegetable = (name) => (dispatch) => {
  apiRequestVegetable(name)
    .then((response) => (dispatch(setVegetable(response))));
};
