import Home from './views/Home';
import ManifestCreation from './views/ManifestCreation';
import ManifestList from './views/ManifestList';

const routes = [
  {
    path: '/',
    element: <Home />,
    exact: true,
  },
  {
    path: '/manifest-list',
    element: <ManifestList />,
    exact: true,
  },
  {
    path: '/manifest-creation',
    element: <ManifestCreation />,
    exact: true,
  },
];

export default routes;
