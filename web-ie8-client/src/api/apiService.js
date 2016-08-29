
const checkStatus = (response) => {
  if (response.status >= 200 && response.status < 300) {
    return response;
  }
  const error = new Error(response.statusText);
  error.response = response;
  throw error;
};

const parseJSON = (response) => (response.json());

export const requestVegetables = () => (
  fetch(`http://${window.location.hostname}:8003`, {
    method: 'get',
    headers: {
      Accept: 'application/json',
      'Content-Type': 'application/json'
    }
  })
  .then(checkStatus)
  .then(parseJSON)
);

export const requestVegetable = (name) => (
  fetch(`http://${window.location.hostname}:8003/${name}`, {
    method: 'get',
    headers: {
      Accept: 'application/json',
      'Content-Type': 'application/json'
    }
  })
  .then(checkStatus)
  .then(parseJSON)
);
