import { VEGETABLES_SET, VEGETABLE_SET } from 'constants/actionTypes';

const initialState = [];

const vegetables = (state = initialState, action) => {
  switch (action.type) {
    case VEGETABLES_SET:
      return [...action.vegetables];
    case VEGETABLE_SET:
      return [action.vegetable];
    default:
      return state;
  }
};

export default vegetables;
