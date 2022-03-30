import ManifestCreation from './views/ManifestCreation';
import ManifestList from './views/ManifestList';

const routes = [
  {
    path: '/',
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
