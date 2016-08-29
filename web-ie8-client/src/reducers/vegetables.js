import { VEGETABLES_SET, VEGETABLE_SET } from 'constants/actionTypes';

const initialState = [
  {
    name: 'Carro'
  },
  {
    name: 'Potato'
  }
];

const vegetables = (state = initialState, action) => {
  switch (action.type) {
    case VEGETABLES_SET:
      return [...state, ...action.vegetables];
    case VEGETABLE_SET:
      return [...state, action.vegetable];
    default:
      return state;
  }
};

export default vegetables;
