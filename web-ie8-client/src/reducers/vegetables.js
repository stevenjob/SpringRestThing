
const initialState = [
  {
    name: 'Carrot'
  },
  {
    name: 'Potato'
  }
];

const vegetables = (state = initialState, action) => {
  console.log(action);
  return state;
};

export default vegetables;
